<div class="modal fade" id="apiDisplayModal" tabindex="-1" role="dialog"
     aria-labelledby="apiDisplayModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="apiDisplayModalLabel">IMDB Information</h4>
            </div>
            <div class="modal-body">
                <table class="table table-bordered">
                    <tr>
                        <th>Title:</th>
                        <td id="dvd-imdbTitle"></td>
                    </tr>
                    <tr>
                        <th>Runtime:</th>
                        <td id="dvd-runtime"></td>
                    </tr>
                    <tr>
                        <th>Plot:</th>
                        <td id="dvd-plot"></td>
                    </tr>
                                        <tr>
                        <th></th>
                        <td> </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td id="dvd-poster"></td>
                    </tr>                   
                </table>
            </div>
            <div id="reviews"> Read Reviews </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">
                    Close
                </button>
            </div>
        </div>
    </div>
</div>