<?php
$mysql = new mysql("jdbc:oracle:thin:ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com:1521:orcl", "PS_Java_19", "Revature","Project1");
if($mysql ->connect_error)
{
	exit('Connection failed!')
}

$sql = "SELECT * FROM EMPLOYEE1";

$stmt = $mysql ->prepare($sql);
$stmt->bind_param("s", $_GET['e']);
$stmt->execute();
$stmt->store_result();
$stmt->bind_result($Employee_FN, $Employee_LN, $Employee_EM, $Employee_RR, $Employee_ID, $Manager_ID);
$stmt->fetch();
$stmt->close();

echo "<table>";
echo "<tr>";
echo "<th>EMPLOYEE_FN</th>";
echo "<td>" . $Employee_FN . "</td>";
echo "<th>EMPLOYEE_LN/th>";
echo "<td>" . $Employee_LN . "</td>";
echo "<th>EMPLOYEE_EM</th>";
echo "<td>" . $Employee_EM . "</td>";
echo "<th>EMPLOYEE_RR</th>";
echo "<td>" . $Employee_RR . "</td>";
echo "<th>EMPLOYEE_ID</th>";
echo "<td>" . $Employee_ID . "</td>";
echo "<th>MANAGER_ID</th>";
echo "<td>" . $Manager_ID . "</td>";
echo "</tr>";
echo "</table>";
?>