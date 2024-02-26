package Uwaterloo.ece498.group38.visicam.presentation

import Uwaterloo.ece498.group38.visicam.domain.chat.BluetoothDeviceDomain
import Uwaterloo.ece498.group38.visicam.domain.chat.BluetoothMessage

data class BluetoothUiState (
    val scannedDevices: List<BluetoothDeviceDomain> = emptyList(),
    val pairedDevices: List<BluetoothDeviceDomain> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMessage: String? = null,
    val messages: List<BluetoothMessage> = emptyList()
    )