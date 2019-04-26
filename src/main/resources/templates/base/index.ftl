<#assign title = view_name/>
<#include "/common/header.ftl"/>

<#if items??>
    <#list items as user>

        <div style="outline: dotted hotpink;position: relative;height: 2rem;margin: 1rem;padding: 1rem;border-radius: 20px;border: dotted hotpink;">
            <span style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem">
                ${user.id}
            </span>
            <span style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem;width: 40vw;">
                ${user.firstname}
            </span>

            <a href="/admin/user/details/${user.id}">details</a>
            <form
                    action="/admin/user/delete/${user.id}"
                    method="post"
                    style="padding: 1.5rem;display: inline-block;height: 4rem;border-right: solid hotpink;box-sizing: border-box;margin-top: -1rem;">
                <input type="submit" value="supprimer">
            </form>
        </div>

    </#list>
</#if>

<#include "/common/footer.ftl"/>