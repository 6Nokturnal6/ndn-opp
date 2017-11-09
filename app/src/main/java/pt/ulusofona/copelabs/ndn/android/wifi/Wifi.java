/*
 * COPYRIGHTS COPELABS/ULHT, LGPLv3.0, 2017/9/7.
 * Class is part of the NSense application.
 */

package pt.ulusofona.copelabs.ndn.android.wifi;

import android.content.Context;
import android.util.Log;

import pt.ulusofona.copelabs.ndn.android.wifi.p2p.WifiP2p;

/**
 * This class is responsible for discover wifi p2p devices, services
 * and also text records which are being announced.
 * @author Miguel Tavares (COPELABS/ULHT)
 * @version 1.0, 2017
 */
public class Wifi {

    /** This variable is used to debug Wifi class */
    private static final String TAG = "Wifi";

    /** This object is used to instantiate the wifi p2p features */
    private WifiP2p mWifiP2p;

    public Wifi(Context context) {
        mWifiP2p = new WifiP2p(context);
        mWifiP2p.start();
    }


    /**
     * This method closes all features related with this class
     */
    public void close() {
        Log.i(TAG, "Closing Wifi");
        mWifiP2p.stop();
    }
}
