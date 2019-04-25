

<#assign title = "User"/>
<#include "/common/header.ftl"/>

        <#if links??>
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
        </#if>

<#include "/common/footer.ftl"/>