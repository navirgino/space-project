"use strict";
$(document).ready(function(){
    "use strict";
    $(document).ready(function(){
        const root = 'https://images-api.nasa.gov';
        return fetch("https://api.nasa.gov/planetary/apod" + "?" + libraryKey)
            .then(function (res) {
                return res.json();
                //get all the data from the req

            }).then(function (data) {
                console.log(data);
                $('.description').append(data.explanation);

                $('.card').prepend(`<img class="card-img-top" src="${data.hdurl}" alt="" />`);
                return data;

            })

    });

});