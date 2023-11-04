// Hypertext Preprocessor.

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
            // Check Even or Odd 

            // 1️⃣  Solution
            
            $n = 5;

            // if($n == 0){
            //     echo "Zero";
            // }
            // else{
            //     if($n%2==0){
            //         echo "Even";
            //     }
            //     else echo "Odd";
            // }

            // 2️⃣  Solution

            // if($n == 0){
            //     echo "Zero";
            // }
            // else {
            //     $result = $n%2 == 0 ? "Even" : "Odd";
            //     echo "The Result is: $result";
            // }

            // 3️⃣ Solution
            $n = 99;

            // if($n == 0){
            //         echo "Zero";
            //     }
            // else{
            // $result = !$n%2 ? "Even" : "Odd";
            // echo "The result is: $result";
            // }

            // 4️⃣ Solution
            if($n == 0){
                echo "Zero";
            }
            else{
                $result = $n&1;
                // echo "The result: $result";
                if($result){
                    echo "The Number is Odd";
                }
                else{
                    echo "Even";
                }
            }

            ?>
          </h3>
    <!-- </center> -->
</body>

</html>
