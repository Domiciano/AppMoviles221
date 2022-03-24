<img src="https://www.icesi.edu.co/calipostalessonoras/images/logo_icesi-01.png" width="300"><br>

# Semana 9

Clone el siguiente repositorio:
```
https://github.com/Domiciano/Clase9CamaraGaleria
```

Cuando tenga que usar la cámara use esto en el manifest
```
<application>
    ...
    <provider
            android:authorities="edu.co.icesi.camgaltest"
            android:name="androidx.core.content.FileProvider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data android:name="android.support.FILE_PROVIDER_PATHS" android:resource="@xml/paths"/>
    </provider>
    ...
</application>
```
