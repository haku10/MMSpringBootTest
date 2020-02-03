(function () {

	/*Swiper関連*/
    var mySwiper = new Swiper ('.swiper-container', {
        effect: "slide",
        slidesPerView: 2,
        spaceBetween: 10,
        centeredSlides : true,
        loop: true,
        navigation:{
            pagination: '.swiper-pagination',
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev'
        }

      })
}());