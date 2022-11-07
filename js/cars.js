import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-analytics.js";
import { getDatabase,ref, child, get } from "firebase/database";
import { getAuth } from "https://www.gstatic.com/firebasejs/9.6.10/firebase-auth.js";

const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const auth = getAuth(app);
const carName1 = document.getElementById("Car1name");
const database = ref(getDatabase());


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
    html = "Hello There!";
    document.getElementById("Car1name").outerHTML = html
});
  