firstTime = sessionStorage.getItem("firstTime");

if (firstTime === null){
    alert('Hello from SE452_Group9. Welcome to Online Shoe Shop');
    sessionStorage.setItem("firstTime", "false");
}    