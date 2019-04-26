<form method="post" action="/admin/job/create">

    <label>name</label> <!-- TODO : ajouter les autres nom-->
    <#list items.fields as field>
        <input type="text" name=${field.name}>
    </#list>

    <input type="submit" value="create">


</form>