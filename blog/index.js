
//sidebar elementss
const sideBar = document.querySelector(".open_menu")
const menu = document.querySelector(".topic_button")

menu.addEventListener("click", function(){
  sideBar.classList.remove("close-sidebar")
  sideBar.classList.add("open-sidebar")
})


const close = document.querySelector(".close-icon")
close.addEventListener("click", function(){
  sideBar.classList.remove("open-sidebar")
  sideBar.classList.add("close-sidebar")
})

const sideBar1 = document.querySelector(".open_menu1")
const menu1 = document.querySelector(".theme_btn")

menu1.addEventListener("click", function(){
  sideBar1.classList.remove("close-sidebar1")
  sideBar1.classList.add("open-sidebar1")
})


const close1 = document.querySelector(".close-icon1")
close1.addEventListener("click", function(){
  sideBar1.classList.remove("open-sidebar1")
  sideBar1.classList.add("close-sidebar1")
})

//searchbar animation
const searchbar = document.querySelector(".searchbar")
const searchicon = document.querySelector(".searchicon")

searchbar.addEventListener("click", function(){
    searchicon.style.display = "none";
})







//more_btn.addEventListener("click", function(){
// fulltext.style.display = "block";
// more_btn.innerHTML = "readless";
//}) 


function setTheme(theme) {
  document.body.className = '';
  document.body.classList.add(theme + '_theme');
  localStorage.setItem('selectedTheme', theme); // Save theme
}

const home_container = document.querySelector(".container");
const blog = document.querySelector(".blog");
const blog_rant = document.querySelector(".blog_rant");
const blog_rtod = document.querySelector(".blog_rtod");

function reality_function(){
  blog.style.display = "inline";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "inline";
}

function rant_function(){
  blog_rant.style.display = "inline"; 
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  home_container.style.display = "inline";
}

function rtod_function(){
  blog_rtod.style.display = "inline";
  blog.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "inline";
}


const back_to_home = document.querySelector(".close-icontitle");
const back_home2 = document.querySelector(".close-icontitle2");
const back_home3 = document.querySelector(".close-icontitle3");


back_to_home.addEventListener("click", function(){
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "inline";
})

back_home2.addEventListener("click", function(){
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "inline";
})

back_home3.addEventListener("click", function(){
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "inline";
})
  


const fulltext = document.querySelector(".full_blog")
const more_btn = document.querySelector(".more_btn");
const more_btn2 = document.querySelector(".more_btn2");
const more_btn3 = document.querySelector(".more_btn3");


more_btn.addEventListener("click", function(){
  fulltext.style.display = "inline";
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "none";
})

more_btn2.addEventListener("click", function(){
  fulltext.style.display = "inline";
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "none";
})

more_btn3.addEventListener("click", function(){
  fulltext.style.display = "inline";
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "none";
})

const full_read_more = document.querySelector(".full_read_more");

full_read_more.addEventListener("click", function(){
  fulltext.style.display = "none";
  blog.style.display = "none";
  blog_rtod.style.display = "none";
  blog_rant.style.display = "none";
  home_container.style.display = "inline";
})

const home_vid = document.getElementById("background_video");
const royalty_vid = document.getElementById("richmf_vid");
const street_vid = document.getElementById("street_vid");
const tech_vid = document.getElementById("tech_vid");

if (fulltext.style.display == "inline"){
      home_vid.style.opacity = "0.7";
      royalty_vid.style.opacity = "0.7";
      street_vid.style.opacity = "0.7";
      tech_vid.style.opacity = "0.7";
}



