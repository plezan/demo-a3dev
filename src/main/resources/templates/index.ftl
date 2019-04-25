Main index
<#if links??>
<div>
    <#list links?values as k>
    <ul>
        <#list k as link>
        <#assign ref = link?replace("{id}",10)>
        <#assign ref = ref?replace("{navigationPath}","data")>
        <li>
            <a href="${ref}">${link}</a>
        </li>
        </#list>
    </ul>
    </#list>
</div>
</#if>
