if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
}

jsRoutes.controllers.Application.contactSubmit().ajax({

    success: function() {

        alert('Sucess');

    },

    error: function() {

        alert('Failure');

    }

});
