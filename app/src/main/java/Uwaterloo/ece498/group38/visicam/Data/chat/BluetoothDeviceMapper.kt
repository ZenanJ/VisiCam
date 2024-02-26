package Uwaterloo.ece498.group38.visicam.Data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import Uwaterloo.ece498.group38.visicam.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}