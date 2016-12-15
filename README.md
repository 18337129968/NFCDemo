# NFCDemo
NFC是一套短距离的无线通信，通常距离是4厘米或更短。但传输建立速度要比红外和蓝牙技术快很多，传输速度比红外块得多。
###AndroidManifest
```
 <uses-permission android:name="android.permission.NFC" />

    <uses-feature
        android:name="android.hardware.nfc"
        android:required="true" />
```
###activity 一定要设置launchMode为singleTop或者singleTask在栈单一保证每次启动都是该栈中activity
```
 <activity
            android:name=".ReadNFCActivity"
            android:label="NFC"
            android:launchMode="singleTop" />
```
###获取NFC标签TagID
```
 byte[] rawIdm = intent.getByteArrayExtra(NfcAdapter.EXTRA_ID);
```
需要转换十六进制，4字节标签id可生产42.9亿，不能保证就是唯一ID，但42.9亿个几乎是唯一的，如果不放心可写入nfc标签UUID
<br><br>
***相关技术文档***
[Android开发 NFC技术开发（一）](http://blog.csdn.net/xhf_123/article/details/53640418)