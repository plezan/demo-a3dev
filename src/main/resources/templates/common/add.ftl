<form method="post" action="/admin/job/create">

    <!-- TODO : ajouter les autres nom-->
    <#list items.fields as field>
        <label>${field.name}</label>
        <input type="text" name=${field.name}>
    </#list>


    <input type="submit" value="create">
</form>