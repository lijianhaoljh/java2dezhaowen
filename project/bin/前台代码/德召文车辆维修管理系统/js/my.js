<<<<<<< HEAD
//全局参数定义
var data = {
	ip:"http://localhost:8080/",
	perms:[],
	params:{}
}

//加载权限内容.
function loadPerms(){
	$.ajax({
		url: data.ip + "perms/findPerms",
		type: "get",
		xhrFields: {
			withCredentials: true
		},
		dataType: "json",
		success: function(response) {
			console.log(response)
			data.perms = response;
		},
		error: function(error) {
			console.log(error);
		}
	});
}
//loadPerms();

function openIFM(item){
	var flag = $(".my-tab>li>a[href='#"+item.ename+"']");
	$(".my-tab>li").removeClass("active");
	$(".tab-content>div").removeClass("active");
	if(flag[0]) {
		flag.parent().addClass("active");
		$(".tab-content>div#"+item.ename).addClass("active");
		return;
	};
	let nav_li = `<li class="active"><a href="#${item.ename}" data-toggle="tab">${item.name}</a></li>`;
	let tab_div = `<div id="${item.ename}" class="active tab-pane">
					<iframe src="./html/${item.path}"></iframe>
				</div>`;
	$(".my-tab").append(nav_li);
	$(".tab-content").append(tab_div);
=======


var data = {
	ip:"http://localhost:8080/"
>>>>>>> refs/remotes/origin/pengyumei
}
