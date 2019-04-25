<html lang="fr"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>TP SPRINGBOOT A3-DEV</title>
</head>

<body style="
    background: cyan;
">



<header style="
        background: linear-gradient(169deg,#e66465, #9198e5);
    ">
    <h1 style="
        display: inline-block;
        color: white;
        font-family: &quot;comic sans ms&quot;;
        margin-left: 2rem;
    ">Yolo User</h1>
    <form action="user" method="POST" style="
        display: inline-block;
    ">
        <input type="submit" value="Ajouter" style="height: 100%;">
    </form>
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

        <#list users as user>
            <div style="outline: dotted hotpink;position: relative;height: 2rem;margin: 1rem;padding: 1rem;border-radius: 20px;border: dotted hotpink;">
                <span style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem">
                    ${user.id}
                </span>
                <span style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem;width: 40vw;">
                    ${user.firstname}
                </span>

                <form action="user" method="get" style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem;">
                    <input type="hidden" name="id" value="1">
                    <input type="submit" value="détails">
                </form>
                <form
                        action="user/delete"
                        method="get"
                        onsubmit="return confirm('Êtes vous sur de vouloir supprimmer ${user.firstname} ?')"
                        style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem;">
                    <input type="hidden" name="id" value="${user.id}">
                    <input type="submit" value="supprimer">
                </form>
            </div>

        </#list>



    </div>
</div>

<footer style="background: linear-gradient(349deg,#e66465, #9198e5);padding: 2rem;color: white;font-family: &quot;comic sans ms&quot;;font-weight: bold;text-align: center;">
    <p>
        Créé avec ❤️, parce que c'est notre projet !
    </p>
</footer>

</body></html>