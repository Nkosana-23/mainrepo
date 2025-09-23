or (let i = 0; i < 300; i++) {
    window[`moreText${i}`] = function() {
        // Get the elements by their IDs
        let dots = document.getElementById(`dots${i}`);
        let seeMore = document.getElementById(`more${i}`);
        let btnText = document.getElementById(`btn${i}`);
        
        // Ensure the elements exist before accessing them
        if (!dots || !seeMore || !btnText) return; // Skip iteration if any element is missing
        
        // Toggle visibility based on the current state of the dots
        if (dots.style.display === "none") {
            dots.style.display = "inline";
            btnText.innerHTML = "Read more";
            seeMore.style.display = "none";
        } else {
            dots.style.display = "none";
            btnText.innerHTML = "Read less";
            seeMore.style.display = "inline";
            seeMore.style.marginBottom = "250px";
        }
    };
}




//sidebar elementss
const sideBar = document.querySelector(".sidebar")
const menu = document.querySelector(".menu-icon")

menu.addEventListener("click", function(){
  sideBar.classList.remove("close-sidebar")
  sideBar.classList.add("open-sidebar")
})


const close = document.querySelector(".close-icon")
close.addEventListener("click", function(){
  sideBar.classList.remove("open-sidebar")
  sideBar.classList.add("close-sidebar")
})
