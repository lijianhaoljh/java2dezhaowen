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

loadPerms();

function openIFM(it){
	if(it==0){
		$(".my-tab>li").removeClass("active");
		$(".tab-content>div").removeClass("active");
		$("[href='#index']").parent().addClass("active");
		$("#index").addClass("active");
		return;
	}
	var flag = $(".my-tab>li>a[href='#"+it.cename+"']");
	$(".my-tab>li").removeClass("active");
	$(".tab-content>div").removeClass("active");
	if(flag[0]) {
		flag.parent().addClass("active");
		$(".tab-content>div#"+it.cename).addClass("active");
		return;
	};
	let nav_li = `<li class="active"><a href="#${it.cename}" data-toggle="tab">${it.name}</a></li>`;
	let tab_div = `<div id="${it.cename}" style="height: 100%;" class="active tab-pane">
				   <iframe src="${it.path}"></iframe>
				   </div>`;
	$(".my-tab").append(nav_li);
	$(".tab-content").append(tab_div);
}
