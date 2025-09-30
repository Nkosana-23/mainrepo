 function updateClock() {
        const now = new Date();
        const date = now.toLocaleDateString();
        const time = now.toLocaleTimeString();
        document.getElementById('clock').textContent = `${date} ${time}`;
}
setInterval(updateClock, 1000);
updateClock(); // initial call






function showAppsPage() {
  const page = document.getElementById("appsPage");
  const home = document.querySelector(".homescreen_container");
  home.style.display = "none";
  page.classList.add("show");
}


function hideAppsPage() {
  const home = document.querySelector(".homescreen_container");
  home.style.display = "inline";
  const page = document.getElementById("appsPage");

  // Add a temporary class to trigger exit animation
  page.classList.add("hiding");

  // Wait for animation to finish, then fully hide it
  setTimeout(() => {
    page.classList.remove("show");
    page.classList.remove("hiding");
  }, 500); // Match CSS transition duration
}



navigator.getBattery().then(function(battery) {
  function updateBatteryStatus() {
    const level = Math.round(battery.level * 100);
    document.querySelector('.battery-level').textContent = `${level}%`;
  }

  updateBatteryStatus();
  battery.addEventListener('levelchange', updateBatteryStatus);
});


function updateWifiStatus() {
  const wifiIcon = document.querySelector('.bi-wifi');
  if (navigator.onLine) {
    wifiIcon.classList.remove('bi-wifi-off');
    wifiIcon.classList.add('bi-wifi');
  } else {
    wifiIcon.classList.remove('bi-wifi');
    wifiIcon.classList.add('bi-wifi-off');
  }
}

// Initial check
updateWifiStatus();

// Listen for changes
window.addEventListener('online', updateWifiStatus);
window.addEventListener('offline', updateWifiStatus);


