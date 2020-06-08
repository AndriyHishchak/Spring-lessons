ws = new WebSocket("ws://localhost:8086/pong");

ws.onopen = function () {
   // actionSec("open connection")
}

ws.onmessage = function (ev) {
    actionSec(ev.data)
}

ws.onerror = function (ev) {}
ws.onclose = function (ev) {}

function actionSec(message) {
    var output = document.getElementById("inscroll");
    var newP = document.createElement("p");
    newP.appendChild(document.createTextNode(message));
    output.appendChild(newP);
}

window.onmousemove=function (e) {
    var xx = $(document).height * .9 - e.y
    if(xx < 0) {
        ws.send("load");
    }
}

/*function  ping() {
var message = document.getElementById('message').value;
action('send :' + message);
ws.send(message)*/


