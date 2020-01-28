function color(){
	$('#step').css('color', '#ff0000');
};

function gridtab(){

	  var dt = [
		     {cd:'A001', name:'test1', price:200}
		    ,{cd:'A002', name:'test2', price:100}
		    ,{cd:'A003', name:'test3', price:300}
		    ,{cd:'A004', name:'test4', price:250}
		    ,{cd:'A005', name:'test5', price:800}
		  ];
	$("#grid").jqGrid({
	     data: dt
	     ,datatype: 'local'
	     ,colNames:['コード', 'テスト', '値段']
	     ,colModel:[
	         {index:'cd', name:'cd', width:'80px', align:'center'}
	        ,{index:'name', name:'name', width:'150px', align:'left', editable:true}
	        ,{index:'price', name:'price', width:'100px', align:'right', editable:true, editoptions:{maxlength:5}}
	      ]
	     ,height: 'auto'
	     ,cellEdit: true
	     ,cellsubmit: 'clientArray'
	     ,caption: '商品一覧'
	   });
};