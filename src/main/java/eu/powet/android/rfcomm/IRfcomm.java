package eu.powet.android.rfcomm;

import java.util.Set;

import android.bluetooth.BluetoothDevice;

/**
 * Created by jed User: jedartois@gmail.com Date: 22/03/12 Time: 12:34
 */
public interface IRfcomm {

	public byte[] read();

	public void write(byte[] data);

	public void close();

	public boolean isConnected();
	
	public void connect(BluetoothDevice device);

	public Set<BluetoothDevice> getDevices();

	public void discovering();
	
	public void setDiscoverable(int duration);

	public void cancelDiscovery();

	public void addEventListener(BluetoothEventListener listener);

	public void removeEventListener(BluetoothEventListener listener);

	public BluetoothDevice getDevice(String address);
	
	public void startServerSocket();
	
	public void unregisterReceiver();
}
