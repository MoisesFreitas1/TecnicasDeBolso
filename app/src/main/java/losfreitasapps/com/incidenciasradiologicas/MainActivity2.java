package losfreitasapps.com.incidenciasradiologicas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sendbird.android.SendBird;
import com.sendbird.android.SendBirdException;
import com.sendbird.android.User;

/**
 * SendBird Android Sample UI
 */
public class MainActivity2 extends FragmentActivity {
    public static String VERSION = "3.0.8.0";

    private enum State {DISCONNECTED, CONNECTING, CONNECTED}

    /**
     * To test push notifications with your own appId, you should replace google-services.json with yours.
     * Also you need to set Server API Token and Sender ID in SendBird dashboard.
     * Please carefully read "Push notifications" section in SendBird Android documentation
     */
    private static final String appId = "52526806-77A3-48CA-A16E-8CF11BB94B4F"; /* Sample SendBird Application */

    public static String sUserId;
    private String mNickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sUserId = getPreferences(Context.MODE_PRIVATE).getString("user_id", "");
        mNickname = getPreferences(Context.MODE_PRIVATE).getString("nickname", "");

        SendBird.init(appId, this);

        ((EditText) findViewById(R.id.etxt_user_id)).setText(sUserId);
        ((EditText) findViewById(R.id.etxt_user_id)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                sUserId = s.toString();
            }
        });

        ((EditText) findViewById(R.id.etxt_nickname)).setText(mNickname);
        ((EditText) findViewById(R.id.etxt_nickname)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                mNickname = s.toString();
            }
        });

        findViewById(R.id.btn_connect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) view;
                if (btn.getText().equals("Conectar")) {
                    connect();
                } else {
                    disconnect();
                }

                Helper.hideKeyboard(MainActivity2.this);
            }
        });

        findViewById(R.id.btn_open_channel_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, SendBirdOpenChannelListActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_group_channel_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SendBirdGroupChannelListActivity.class);
                startActivity(intent);
            }
        });

        setState(State.DISCONNECTED);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SendBird.disconnect(null);
    }

    @Override
    protected void onResume() {
        super.onResume();
        /**
         * If the minimum SDK version you support is under Android 4.0,
         * you MUST uncomment the below code to receive push notifications.
         */
//        SendBird.notifyActivityResumedForOldAndroids();
    }

    @Override
    protected void onPause() {
        super.onPause();
        /**
         * If the minimum SDK version you support is under Android 4.0,
         * you MUST uncomment the below code to receive push notifications.
         */
//        SendBird.notifyActivityPausedForOldAndroids();
    }

    private void setState(State state) {
        switch (state) {
            case DISCONNECTED:
                ((Button) findViewById(R.id.btn_connect)).setText("Conectar");
                findViewById(R.id.btn_connect).setEnabled(true);
                findViewById(R.id.btn_open_channel_list).setEnabled(false);
                findViewById(R.id.btn_group_channel_list).setEnabled(false);
                break;

            case CONNECTING:
                ((Button) findViewById(R.id.btn_connect)).setText("Conectando...");
                findViewById(R.id.btn_connect).setEnabled(false);
                findViewById(R.id.btn_open_channel_list).setEnabled(false);
                findViewById(R.id.btn_group_channel_list).setEnabled(false);
                break;

            case CONNECTED:
                ((Button) findViewById(R.id.btn_connect)).setText("Desconectar");
                findViewById(R.id.btn_connect).setEnabled(true);
                findViewById(R.id.btn_open_channel_list).setEnabled(true);
                findViewById(R.id.btn_group_channel_list).setEnabled(true);
                break;
        }
    }

    private void connect() {
        SendBird.connect(sUserId, new SendBird.ConnectHandler() {
            @Override
            public void onConnected(User user, SendBirdException e) {
                if (e != null) {
                    Toast.makeText(MainActivity2.this, "" + e.getCode() + ":" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    setState(State.DISCONNECTED);
                    return;
                }

                String nickname = mNickname;

                SendBird.updateCurrentUserInfo(nickname, null, new SendBird.UserInfoUpdateHandler() {
                    @Override
                    public void onUpdated(SendBirdException e) {
                        if (e != null) {
                            Toast.makeText(MainActivity2.this, "" + e.getCode() + ":" + e.getMessage(), Toast.LENGTH_SHORT).show();
                            setState(State.DISCONNECTED);
                            return;
                        }

                        SharedPreferences.Editor editor = getPreferences(Context.MODE_PRIVATE).edit();
                        editor.putString("user_id", sUserId);
                        editor.putString("nickname", mNickname);
                        editor.commit();

                        setState(State.CONNECTED);
                    }
                });

//                if (FirebaseInstanceId.getInstance().getToken() == null) return;
//
//                SendBird.registerPushTokenForCurrentUser(FirebaseInstanceId.getInstance().getToken(), new SendBird.RegisterPushTokenWithStatusHandler() {
//                    @Override
//                    public void onRegistered(SendBird.PushTokenRegistrationStatus pushTokenRegistrationStatus, SendBirdException e) {
//                        if (e != null) {
//                            Toast.makeText(MainActivity2.this, "" + e.getCode() + ":" + e.getMessage(), Toast.LENGTH_SHORT).show();
//                            return;
//                        }
//                    }
//                });
            }
        });

        setState(State.CONNECTING);
    }

    private void disconnect() {
        SendBird.disconnect(new SendBird.DisconnectHandler() {
            @Override
            public void onDisconnected() {
                setState(State.DISCONNECTED);
            }
        });
    }
}
