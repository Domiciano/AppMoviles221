package edu.co.icesi.semana7kotlina

import java.net.URL
import javax.net.ssl.*


class HTTPSWebUtilDomi {

    fun GETRequest(url: String): String {
        val url = URL(url)
        val client = url.openConnection() as HttpsURLConnection
        client.requestMethod = "GET"
        return client.inputStream.bufferedReader().readText()
    }

    fun POSTRequest(url: String, json: String): String {
        val url = URL(url)
        val client = url.openConnection() as HttpsURLConnection
        client.requestMethod = "POST"
        client.setRequestProperty("Content-Type", "application/json")
        client.doOutput = true
        client.outputStream.bufferedWriter().use {
            it.write(json)
            it.flush()
        }
        return client.inputStream.bufferedReader().readText()
    }

    fun POSTtoFCM(json: String): String {
        val url = URL("https://fcm.googleapis.com/fcm/send")
        val client = url.openConnection() as HttpsURLConnection
        client.requestMethod = "POST"
        client.setRequestProperty("Content-Type", "application/json")
        client.setRequestProperty("Authorization", "key=$FCM_KEY")
        client.doOutput = true
        client.outputStream.bufferedWriter().use {
            it.write(json)
            it.flush()
        }
        return client.inputStream.bufferedReader().readText()
    }

    fun PUTRequest(url: String, json: String): String {
        val url = URL(url)
        val client = url.openConnection() as HttpsURLConnection
        client.requestMethod = "PUT"
        client.setRequestProperty("Content-Type", "application/json")
        client.doOutput = true
        client.outputStream.bufferedWriter().use {
            it.write(json)
            it.flush()
        }
        return client.inputStream.bufferedReader().readText()
    }

    fun DELETERequest(url: String): String {
        val url = URL(url)
        val client = url.openConnection() as HttpsURLConnection
        client.requestMethod = "DELETE"
        return client.inputStream.bufferedReader().readText()
    }


    companion object {
        const val FCM_KEY:String = "AAAA5Y28dsA:APA91bHvrWHBdEZIbpl2hmPufyiNgJp1ZNiCenoAb58dM2ydWkGTx5cYtQzlVewJUL2PL0s1Rkir0mTLKtEA0vrrHyeG1bID3HuCd0UVtO91bcuciPPWxZcSsosmRGmGV9N4tEeH90Gr"
    }


}
