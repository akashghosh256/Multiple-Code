function showImage(){
    const fruit = document.getElementById("fruit-select").ariaValueMax;
    const imageContainer = document.getElementById("image-container");

    imageContainer.innerHTML = "";
    if(fruit){
        const img = document.createElement("img");
        img.src = `${fruit}.jpg`;

    }
}

animalImages.forEach(function(image) {
    image.addEventListener("click", function(){
        this.classList.toggle("green-border");
    })
})



RedButton.addEventListener("click", function(){
  colorBox.style.backgroundColor = "red" ; 
});
GreenButton.addEventListener("click", function(){
    colorBox.style.backgroundColor="green";
})


















