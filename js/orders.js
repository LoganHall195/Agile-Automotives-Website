import { initializeApp } from "@firebase/app";
import { getDatabase, ref, set } from "@firebase/database";

const functions = require("firebase-functions");
const admin = require("firebase-admin");
admin.initializeApp();

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
//const app = initializeApp(firebaseConfig);

function writeDB(){
    var order = admin.database().ref('/Orders/order1/0')
    var up = {};
    up = {
        carSerial: "0",
        discount: "CMAS30",
        email: "test@email.com",
        name: "Test",
        phone: "1800agileauto",
        totalPrice: "108.23"
    };
 //   const db = getDatabase(app);
  //  set(ref(db, "Orders/order1/0"),
  //  {
   //     name: "Test",
    //    email: "test@email.com",
    //    phone: "1800agileauto",
    //    carSerial: "0",
    //    discount: "CMAS30",
   //     totalPrice: "108.23"
   // }); 
       return order.update(up);
}