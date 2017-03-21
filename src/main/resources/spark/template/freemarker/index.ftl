<!DOCTYPE html>
<html>
<head>
</head>
<style>
    table{
        border-collapse: collapse;
    }
    th,td {
        padding: 15px;
        text-align: center;
        border:1px solid gray;
    }
    td{
        text-align: rigth;
    }
</style>
<body>
    <h2>Valores</h2>
    <table>
        <tr>
            <#list resultRanges.getListValues() as value>
            <td>${value}</td>
            </#list>
        </tr>
    </table>
    <br />
    <h2>Rangos</h2>
    <table>
        <tr>
            <th>VS</th>
            <th>S</th>
            <th>M</th>
            <th>L</th>
            <th>VL</th>
        </tr>
        <tr>
            <td>${resultRanges.getRangeVS()}</td>
            <td>${resultRanges.getRangeS()}</td>
            <td>${resultRanges.getRangeM()}</td>
            <td>${resultRanges.getRangeL()}</td>
            <td>${resultRanges.getRangeVL()}</td>
        </tr>
    </table>
</body>
</html>
