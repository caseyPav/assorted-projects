
$(document).ready(function () {
    loadDvds();

    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'dvd',
            data: JSON.stringify({
                title: $('#add-title').val(),
                releaseDate: $('#add-release-date').val(),
                mpaaRating: $('#add-mpaa-rating').val(),
                director: $('#add-director').val(),
                studio: $('#add-studio').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function (data, status) {
            $('#add-title').val('');
            $('#add-release-date').val('');
            $('#add-mpaa-rating').val('');
            $('#add-director').val('');
            $('#add-studio').val('');
            loadDvds();
        });
    });
});

$('#edit-button').click(function (event) {
    event.preventDefault();
    $.ajax({
        type: 'PUT',
        url: 'dvd/' + $('#edit-dvd-id').val(),
        data: JSON.stringify({
            dvdId: $('#edit-dvd-id').val(),
            title: $('#edit-title').val(),
            releaseDate: $('#edit-release-date').val(),
            mpaaRating: $('#edit-mpaa-rating').val(),
            director: $('#edit-director').val(),
            studio: $('#edit-studio').val()
        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'
    }).success(function () {
        loadDvds();
    });
});

$('#search-button').click(function (event) {
    event.preventDefault();
    $.ajax({
        type: 'POST',
        url: 'search/dvds',
        data: JSON.stringify({
            title: $('#search-title').val(),
            releaseDate: $('#search-release-date').val(),
            mpaaRating: $('#search-mpaa-rating').val(),
            director: $('#search-director').val(),
            studio: $('#search-studio').val()
        }),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json'
    }).success(function (data, status) {
        $('#search-title').val('');
        $('#search-release-date').val('');
        $('#search-mpaa-rating').val('');
        $('#search-director').val('');
        $('#search-studio').val('');
        fillDvdTable(data, status);
    });
});

$('#detailsModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.dvdId);
        modal.find('#dvd-title').text(dvd.title);
        modal.find('#dvd-release-date').text(dvd.releaseDate);
        modal.find('#dvd-mpaa-rating').text(dvd.mpaaRating);
        modal.find('#dvd-director').text(dvd.director);
        modal.find('#dvd-studio').text(dvd.studio);
    });
});

$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');
    var modal = $(this);
    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.dvdId);
        modal.find('#edit-dvd-id').val(dvd.dvdId);
        modal.find('#edit-title').val(dvd.title);
        modal.find('#edit-release-date').val(dvd.releaseDate);
        modal.find('#edit-mpaa-rating').val(dvd.mpaaRating);
        modal.find('#edit-director').val(dvd.director);
        modal.find('#edit-studio').val(dvd.studio);
    });
});
   var page = [];
$('#apiDisplayModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var sUrl, movie, omdbData;
    var modal = $(this);
 
    movie = element.data('dvd-title');
    sUrl = 'https://www.omdbapi.com/?t=' + movie + '&type=movie&tomatoes=true';
    $.ajax(sUrl, {
        complete: function (p_oXHR, p_sStatus) {
            omdbData = $.parseJSON(p_oXHR.responseText);
            console.log(omdbData);
            modal.find('#dvd-imdbTitle').text(omdbData.Title);
            modal.find('#dvd-runtime').text(omdbData.Runtime);
            modal.find('#dvd-plot').text(omdbData.Plot);
            modal.find('#dvd-poster').html('<img src="' + omdbData.Poster + '"/>');
            page = omdbData.tomatoURL;
            
        }
    });
});

alert(page);

/*$("#reviews").click(function(page) {
  opendialog(page);
});

function opendialog(page) {
  var $dialog = $('#reviews')
  .html('<iframe style="border: 0px; " src="' + page + '" width="100%" height="100%"></iframe>')
  .dialog({
    title: "Rotten Tomatoes",
    autoOpen: false,
    dialogClass: 'dialog_fixed,ui-widget-header',
    modal: true,
    height: 500,
    minWidth: 400,
    minHeight: 400,
    draggable:true,
    /*close: function () { $(this).remove(); },*/
 //   buttons: { "Ok": function () {         $(this).dialog("close"); } }
 // });
//  $dialog.dialog('open');
//}

////////////////////////////////////////////////////////////////////////////////
//TODO:
//
//validate clientside 
//
//fix things
//
//
//easy modals for validation
//https://github.com/saribe/eModal
////////////////////////////////////////////////////////////////////////////////

function loadDvds() {
    $.ajax({
        url: "dvd"
    }).success(function (data, status) {
        fillDvdTable(data, status);
    });
}

function fillDvdTable(dvdList, status) {
    clearDvdTable();
    var cTable = $('#contentRows');
    $.each(dvdList, function (index, dvd) {
        cTable.append($('<tr>')
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#detailsModal'
                                })
                                .text(dvd.title)
                                )
                        )
                .append($('<td>').text(dvd.mpaaRating))
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-title': dvd.title,
                                    'data-toggle': 'modal',
                                    'data-target': '#apiDisplayModal'
                                })
                                .text('IMDB')
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'data-dvd-id': dvd.dvdId,
                                    'data-toggle': 'modal',
                                    'data-target': '#editModal'
                                })
                                .text('Edit')
                                )
                        )
                .append($('<td>')
                        .append($('<a>')
                                .attr({
                                    'onClick': 'deleteDvd(' + dvd.dvdId + ')'
                                })
                                .text('Delete')
                                )
                        )
                );
    });
}

function deleteDvd(id) {
    var answer = confirm("Do you really want to delete this dvd?");
    if (answer === true) {
        $.ajax({
            type: 'DELETE',
            url: 'dvd/' + id
        }).success(function () {
            loadDvds();
        });
    }
}

function clearDvdTable() {
    $('#contentRows').empty();
}

function editReleaseDate() {
    $('#edit-release-date').enabled = true;
}


