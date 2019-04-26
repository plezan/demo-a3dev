<#assign title = view_name/>
<#include "/common/header.ftl"/>

<ul>
<#if item??>
<#list item as name, value>

    <#if value?is_enumerable>
        <#list value as v>
            ${name}
            <ul>
                <li>${v.name}</li>
            </ul>
        </#list>
    <#else>
        <li>${name} : ${value}</li>
    </#if>
</#list>
</#if>
</ul>

<#include "/common/footer.ftl"/>