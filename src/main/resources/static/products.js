
getProductById();

function getProductById() {

    $.ajax({
        type: 'GET',
        url: ' http://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics',
        success: function (response) {
            let id = response.product.item.tcin;
            let productName = response.product.item.product_description.title;

            getProductPrice(id, productName);

        }
    })
}

function getProductPrice(id, productName) {

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/retail/products/' + id,
        success: function (response) {
            console.log(response)
        }
    })
}