/*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/*
    Created on : Jul 9, 2017, 7:46:29 PM
    Author     : Avhatakali
*/

*{
    margin: 0px;
    padding: 0px;
}

h1{
    font: bold 20px Tahoma;
}

h2{
    font: bold 14px Tahoma;
}

hgroup, header, body, article, nav, footer, aside, section {
    display: block;
}

body{
    width: 100%;
    display: -webkit-box;
    -webkit-box-pack: center;

}

#big_wrapper{
    max-width: 1000px;
    margin: 20px 0px;
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-box-flex: 1;
     text-shadow: 4px 4px 8px blue;
}
#the_header{
    border: 3px solid black;
    padding: 20px
}
#Top_menu{
   border: red;
   color: white;
   background: gray;
   font: bold 14px Tahoma;
}

#Top_menu li{
    display: inline-block;
    padding: 5px;
}

#big_wrapper2{
    display: -webkit-box;
    -webkit-box-orient: horizontal;
}

#main_section{
    -webkit-box-flex: 1;
    margin: 20px;
    padding: 20px;
}

#side_news{
   width: 220px;
   padding: 30px;
   margin: 20px 0px;
}

#the_footer{
    text-align: center;
    padding: 20px;
    border-top: 2px solid blue;
}

.tab {
overflow : hidden;
border: 1px solid #ccc;
background-color: #f1f1f1;
}

.tab button{
background-color: inherit;
float: left;
border: none;
outline: none;
cursor: pointer;
padding: 14px 16px;
transition: 0.3s;
}

.tab button:hover{
background-color: #ddd;
}

.tabContent{
display: none;
padding: 6px 12px;
border: 1px solid #ccc;
border-top: none;
}

.sideNav{
height: 100%;
width: 0;
position: fixed;
top: 0;
left: 0;
background-color: #111;
overflow-x: hidden;
padding-top: 60px;
transition: 0.5s;
}

.sideNav a{
padding: 8px 8px 8px 32px;
text-decoration: none;
font-size: 25px;
color: #818181;
display: block;
transition: 0.3s;
}

.sideNav a:hover{
color: #f1f1f1;
}

.sideNav .closebtn{
position: absolute;
top: 0;
right: 25px;
font-size: 36px;
margin-left: 50px;
}

@media screen and (max-height: 450px){
.sideNav{
 padding-top: 15px;
 }
 .sideNav a{
 font-size: 18px;
 }
}

#main{
transition: margin-left 0.5s;
padding: 20px;
}

p{
padding-left : 40px;
font-size : 18px;
font-style : italic;
border : 2px solid blue;
text-decoration : underline;
}

p1:first-letter{
font-size : 25px;
font-weight : bold;
color : green;
}

button:hover{
color : red;
}

table, td, th {
border: 1px solid black;
color : black;
}

#main_section{
    float: left;
    width: 660px;
    margin: 30px;
}

#side_news{
    float: right;
    width: 220px;
    margin: 20px 0px;
    padding: 30px;
}