<html lang="fr"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>TP SPRINGBOOT A3-DEV</title>
    <link href="https://fonts.googleapis.com/css?family=Orbitron" rel="stylesheet">
    <style>
        body{
            padding: 0;
            margin: 0;
        }
        header{
            position: relative;
            height: 7rem;
            overflow: hidden;
        }
        .header_title{
            background-image: url('tileable.png');
            transform: rotate(-15deg);
            width: 40rem;
            left: -2.5rem;
            top: -5rem;
            background-image: url('tileable.png');
            position: relative;
        }
        .header_title>div{
            height: 100%;
            width: 100%;
            background: linear-gradient(169deg,#e6646570, #9198e5Bf);
        }
        .header_title>div>div{
            transform: rotate(15deg);
            left: 2.5rem;
            top: 5rem;
            height: 100%;
            width: 100%;
            padding-top: 5rem;
            padding-left: 2rem;
        }
        header h1{
            font-family: Orbitron;
            display: inline-block;
            color: white;
            font-size: 3rem;
            margin: 1rem
        }
        .add_button{
            position: absolute;
            right: 3rem;
            top: 2rem;
            transform: scale(1.4);
        }
        .add_button form{
            display: inline-block;
            margin: 0;
        }
        .add_button input{
            border-radius: 2rem;
            font-size: 2rem;
            padding-left: 0.8rem;
            font-family: Orbitron;
            padding-right: 0.8rem;
            padding-top: 0.3rem;
            background: #97809f;
            color: white;
            border: none;
        }
    </style>
</head>

<body style="
    background: #e1ffff;
">



<header>
    <div class='header_title'>
        <div>
            <div>
                <h1>${title}</h1>
            </div>
        </div>
    </div>

    <div class="add_button">
        <form action="user" method="POST">
            <input type="submit" value="+">
        </form>
    </div>
</header>



<!-- <nav><ul><li></li><li></li></ul></nav> -->

<div style="
        position: relative;
        height: 100%;
        overflow: hidden;
        padding-top: 13.1rem;
        margin-top: -13.1rem;
        box-sizing: border-box;
        ">
    <div style="
            position: relative;
            height: 100%;
            overflow-y: scroll;
            box-sizing: border-box;
            ">