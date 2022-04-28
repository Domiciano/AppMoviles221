# Queries en Firestore


```
        Firebase.firestore
            .collection("cities")
            .document("SF")
            .set(City("San Francisco", "CA", "USA", 860000, arrayListOf("west_coast", "norcal")))

        Firebase.firestore
            .collection("cities")
            .document("LA")
            .set(City("Los Angeles", "CA", "USA", 3900000, arrayListOf("west_coast", "socal")))

        Firebase.firestore
            .collection("cities")
            .document("DC")
            .set(City("Washington, D.C.", null, "USA", 680000, arrayListOf("east_coast")))

        Firebase.firestore
            .collection("cities")
            .document("TOK")
            .set(City("Tokio", null, "Japan", 9000000, arrayListOf("kanto", "honshu")))

        Firebase.firestore
            .collection("cities")
            .document("BJ")
            .set(City("Beijing", null, "China", 21500000, arrayListOf("jingjinji", "hebei")))

```