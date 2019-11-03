<html>
    <style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
<body>
    
    <div class="container"><h1>Welcome to "EarthQuakes Near By" program !</h1><br><h3>Please put the coordinates of the city !</h3></div>
    <form action="webapi/myresource">
         <div class="row">
    <div class="col-25">
      <label >Longitude</label>
    </div>
    <div class="col-75">
      <input type="text"  name="lon" placeholder="Longitude..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label >Latitude :</label>
    </div>
    <div class="col-75">
      <input type="text"  name="lat" placeholder="Latitude..">
    </div>
  </div>
<div class="row">
    <input type="submit" value="Submit">
  </div>
    </form>
 
</body>
</html>
