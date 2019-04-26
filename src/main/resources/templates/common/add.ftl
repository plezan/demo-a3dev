<form method="post" action="/admin/${view_name}/create">
        <#list items.fields as field>
        <label>${field.name}</label>
        <input type="text" name=${field.name}>
    </#list>
    <input type="submit" value="create">
</form>