# HxgVoiceBroadcast

## 引用方法

allprojects {

    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }

}

    dependencies {

          implementation 'com.github.huangxiaoguo1:HxgVoiceBroadcast:1.0.0'

    }

## 使用介绍

    注意传入的语音需要放在assets/sound目录下

#### 基本使用

```
   VoicePlay.with(MainActivity.this).play("收到付款1999.99元");
```

#### 设置只报金额数字

```
    VoicePlay.with(MainActivity.this).play("收到付款1999.99元", true);
```

#### 设置前部语音

```
    VoicePlay.with(MainActivity.this).play("收到付款1999.99元", false, Constants.START_SOUND);
```

#### 设置末尾语音

```
    VoicePlay.with(MainActivity.this).play("收到付款1999.99元", false, Constants.START_SOUND, Constants.END_SOUND);
```

#### 直播放传入的语音

```
    VoicePlay.with(MainActivity.this).play(result);//result为语音集合
```