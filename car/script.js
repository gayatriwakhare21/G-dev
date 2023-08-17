var audio = document.createElement('audio');
audio.setAttribute('src', 'sound.mp3');
audio.loop=true;

const back = document.getElementsByClassName("car");
console.log(back);

document.getElementById("car").addEventListener("click", () => {
    audio.play();
console.log("runing");
});