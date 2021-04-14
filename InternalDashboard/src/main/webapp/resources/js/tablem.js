/*if (document.getElementById("program").value == "MM"||document.getElementById("program").value == "NIUM") {*/
	$(".tablemanager").tablemanager({
		firstSort: [[3, 0], [2, 0], [1, 'asc']],
		disable: ["last"],
		appendFilterby: true,
		debug: true,
		vocabulary: {
			voc_filter_by: "Filter By",
			voc_type_here_filter: "Filter...",
			voc_show_rows: "Rows Per Page",
		},
		pagination: true,
		showrows: [5, 10, 20, 50, 100],
	})
/*}*/