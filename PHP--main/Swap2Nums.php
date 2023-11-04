Hypertext Preprocessor.


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edited By Adarsh</title>
</head>

<body>
    <!-- <center> -->
        <h3 style="background-color:aqua;
         color: blue; font-family: vardana; height: 1000px">
            <?php
            // Write a Program to Swap two numbers;
            $a = 12;
            $b = 13;
            echo "<br> Hi Ganesh";
            echo "<br> before swapping numbers a=$a, b=$b>";

            $t = $a;
            $a = $b;
            $b = $t;

            echo "<br> before swapping numbers a=$a, b=$b>";


            // without using third Variable

            $a = $a+$b;
            $b = $a-$b;
            $a = $a-$b;
            echo "<br> Againg swapping but using without using third variables a= $a, b=$b ";


        
            

            ?>
          </h3>
    <!-- </center> -->
</body>

</html>



// Output is:

Hi Ganesh
before swapping numbers a=12, b=13>
before swapping numbers a=13, b=12>
Againg swapping but using without using third variables a= 12, b=13
