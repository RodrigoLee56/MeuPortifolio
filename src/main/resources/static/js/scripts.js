// Navbar functionality
document.addEventListener('DOMContentLoaded', () => {
  const burger = document.querySelector('.navbar-burger');
  const menu = document.getElementById(burger.dataset.target);
  if (burger && menu) {
    burger.addEventListener('click', () => {
      burger.classList.toggle('is-active');
      menu.classList.toggle('is-active');
    });
  }
});

// Carousel functionality
document.addEventListener("DOMContentLoaded", () => {
  const carousels = document.querySelectorAll(".project-carousel");

  carousels.forEach(carousel => {
    const slides = carousel.querySelectorAll("figure");
    let currentIndex = 0;
    let autoPlayInterval = null;

    const updateSlides = () => {
      slides.forEach((slide, index) => {
        slide.classList.toggle("hidden", index !== currentIndex);
        slide.classList.toggle("active-slide", index === currentIndex);
      });
    };

    const nextSlide = () => {
      currentIndex = (currentIndex + 1) % slides.length;
      updateSlides();
    };

    const prevSlide = () => {
      currentIndex = (currentIndex - 1 + slides.length) % slides.length;
      updateSlides();
    };

    const nextBtn = carousel.parentElement.querySelector(".btn-next");
    const prevBtn = carousel.parentElement.querySelector(".btn-prev");

    if (nextBtn) {
      nextBtn.addEventListener("click", () => {
        nextSlide();
        resetAutoPlay();
      });
    }

    if (prevBtn) {
      prevBtn.addEventListener("click", () => {
        prevSlide();
        resetAutoPlay();
      });
    }

    const startAutoPlay = () => {
      autoPlayInterval = setInterval(nextSlide, 4000);
    };

    const resetAutoPlay = () => {
      if (autoPlayInterval) {
        clearInterval(autoPlayInterval);
      }
      startAutoPlay();
    };

    updateSlides();
    startAutoPlay();
  });
});

// Clean success param from URL
if (window.location.search.includes("sucesso=true")) {
  window.history.replaceState({}, document.title, window.location.pathname);
}
