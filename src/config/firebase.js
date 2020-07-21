import firebase from "firebase/app";
// These imports load individual services into the firebase namespace.
import "firebase/auth";
import "firebase/firestore";

const firebaseConfig = {
  apiKey: "AIzaSyBEDPIb7XJ9cJyFnXhEUzp2RW1L4t0zCoY",
  authDomain: "jipe-app.firebaseapp.com",
  databaseURL: "https://jipe-app.firebaseio.com",
  projectId: "jipe-app",
  storageBucket: "jipe-app.appspot.com",
  messagingSenderId: "954348692389",
  appId: "1:954348692389:web:304dfa07e15a4a04097e4c",
  measurementId: "G-EQEBKD045N",
};

firebase.initializeApp(firebaseConfig);
export default firebase;