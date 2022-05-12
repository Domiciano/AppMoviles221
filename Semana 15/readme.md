# Configurar servicio de mensajería

## Dependencias

Para esta sección necesita las dependencias de mensajería
```
implementation 'com.google.firebase:firebase-messaging-ktx:23.0.4'
```

## Cree una clase de servicio
```
class FCMService : FirebaseMessagingService() {

    override fun onMessageReceived(message: RemoteMessage) {
        ...
    }
}
```

## Registre el servicio en el manifest
```
<application>
    ...
    <service
        android:name=".services.FCMService"
        android:exported="false">
        <intent-filter>
            <action android:name="com.google.firebase.MESSAGING_EVENT"/>
        </intent-filter>
    </service>
    ...
</application>
```


## Ahora puede suscribirse
```
Firebase.messaging.subscribeToTopic("noti").addOnSuccessListener {
    Log.e(">>>","Suscrito")
}
```

## Notificaciones
Para obtener JSON del mensaje recibido
```
val obj = JSONObject(message.data as Map<*, *>)
val json = obj.toString()
```


## Referencias
1. https://firebase.google.com/docs/cloud-messaging/fcm-architecture?hl=es-419
2. https://firebase.google.com/docs/cloud-messaging/migrate-v1?hl=es-419#java

