import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-analytics.js";
import { getDatabase,ref, child, get } from "firebase/database";
import { getAuth } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-auth.js";

const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const auth = getAuth(app);
const carName1 = document.getElementById("Car1name");
const database = ref(getDatabase());

function carName1(){
    get(child(database, `/Cars/Car1/carName`)).then((snapshot) => {
      if (snapshot.exists()) {
        window.alert(snapshot.val());
      } else {
        window.alert("No data available");
      }
    }).catch((error) => {
      console.error(error);
    });
  }
  