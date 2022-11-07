import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-analytics.js";
import { getDatabase,ref, child, get } from "firebase/database";
import { getAuth } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-auth.js";

const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const auth = getAuth(app);
const carName1 = document.getElementById("Car1name");
const database = ref(getDatabase());

const firebaseConfig = {
    apiKey: "AIzaSyAKGYcsh-b050TlfBEZSoPdAhCD_P5zxC8",
    authDomain: "softwaree-group7.firebaseapp.com",
    projectId: "softwaree-group7",
    storageBucket: "softwaree-group7.appspot.com",
    messagingSenderId: "983507508483",
    appId: "1:983507508483:web:d9ca8d329ac6142443dd36",
    measurementId: "G-SQ2B4TL68L",
    databaseURL: "https://softwaree-group7-default-rtdb.firebaseio.com",
  };

get(child(database, `/Cars/Car1/carName`)).then((snapshot) => {
    if (snapshot.exists()) {
        html = snapshot.val();
      } else {
        html = "No data available";
      }
    }).catch((error) => {
      console.error(error);
    });


  $(document).ready(function() {
    //html = "Hello There!";
    document.getElementById("Car1name").outerHTML = html
});
  