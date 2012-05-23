package eu.powet.android.rfcomm;

import java.util.Set;

import android.bluetooth.BluetoothDevice;

/**
 * Created by jed User: jedartois@gmail.com Date: 22/03/12 Time: 12:34
 */
public interface IRfcomm {

	/**
	 * Broadcast data to every connected devices
	 * @param data
	 */
	public void broadcast(byte[] data);
	
	/**
	 * Write the data for the specified device given in parameter
	 * @param device
	 * @param data
	 */
	public void write(BluetoothDevice device, byte[] data);

	/**
	 * Write the data for the specified device name given in parameter
	 * @param deviceName
	 * @param data
	 */
	public void writeFromName(String deviceName, byte[] data);
	
	/**
	 * Write the data for the specified device address given in parameter
	 * @param deviceAddress
	 * @param data
	 */
	public void writeFromAddress(String deviceAddress, byte[] data);

	public void stop();

	public boolean isConnected();
	
	public void connect(BluetoothDevice device, boolean secure);

	public Set<BluetoothDevice> getDevices();

	public void discovering();
	
	public void setDiscoverable(int duration);

	public void cancelDiscovery();

	public void addEventListener(BluetoothEventListener listener);

	public void removeEventListener(BluetoothEventListener listener);

	public BluetoothDevice getDevice(String address);
	
	public void start();
	
	public void setName(String name);
	
	public void unregisterReceiver();
	
	public BluetoothDevice getDeviceByName(String name);
	
	public String getMyAddress();
}
