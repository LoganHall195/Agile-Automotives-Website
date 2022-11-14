import { initializeApp } from "@firebase/app";
import { getDatabase, ref, set } from "@firebase/database";

var firebaseConfig = {
    apiKey: "AIzaSyAKGYcsh-b050TlfBEZSoPdAhCD_P5zxC8",
    authDomain: "softwaree-group7.firebaseapp.com",
    projectId: "softwaree-group7",
    storageBucket: "softwaree-group7.appspot.com",
    messagingSenderId: "983507508483",
    appId: "1:983507508483:web:d9ca8d329ac6142443dd36",
    measurementId: "G-SQ2B4TL68L",
    databaseURL: "https://softwaree-group7-default-rtdb.firebaseio.com",
};
const app = initializeApp(firebaseConfig);

function writeDB(){
    const db = getDatabase(app);
    set(ref(db, "Orders/order1"),
    {
        "name": "Test",
        "email": "test@email.com",
        "phone": "1800agileauto",
        "car serial": "0",
        "discount": "CMAS30",
        "total price": "108.23"
    }); 
}