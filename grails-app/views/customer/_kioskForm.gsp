<div class="container">
	<div class="row">
		<div class="col-sm-12">
			<g:img file="banner.png" />
		</div>
	</div>
	<div class="row">
		<div class="col-sm-5 ">
			<h4>Welcome back, John!</h4>
			<h4>You have 4 points.</h4>
		</div>
		<div class="col-sm-6">
			<g:textField name="phone" class="form-control" placeholder="Enter your phone number to check in" />

			<div class="row"><h3></h3></div>
			<div class="row">
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="1" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="2" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="3" onclick="padkey(event)" />
				</div>
			</div>


			<div class="row"><h3></h3></div>
			<div class="row">
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="4" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="5" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="6" onclick="padkey(event)" />
				</div>
			</div>

			<div class="row"><h3></h3></div>
			<div class="row">
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="7" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="8" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="9" onclick="padkey(event)" />
				</div>
			</div>

			<div class="row"><h3></h3></div>
			<div class="row">
				<div class="col-sm-4">
					<input type="button" class="btn btn-danger btn-lg btn-block" name="pad" value="Del" onclick={clearPhoneNumber()} />
					%{-- <g:link action="checkin" class="btn btn-danger btn-lg btn-block" >Del</g:link> --}%
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-block" name="pad" value="0" onclick="padkey(event)" />
				</div>
				<div class="col-sm-4">
					<input type="button" class="btn btn-primary btn-lg btn-success" name="pad" value="GO" />
				</div>
			</div>

		</div><!-- .col-sm-6 -->
	</div><!-- .row -->
</div><!-- .container -->

<script>
function padkey(event) {
	var phoneField = document.getElementById("phone");

	phoneField.value += event.target.value;
}

function clearPhoneNumber() {
	document.getElementById("phone").value = "";
}
</script> 