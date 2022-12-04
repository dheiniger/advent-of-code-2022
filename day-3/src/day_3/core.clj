(ns day-3.core)

(def input
  '(ZTmtZvZLTFNLMQMNRvZncdcHwcScJvcdHnVfwV
    zqjqrzqjCqrjtqWhqChqrznhcfdfVnVSVgcffcgJcSgd
    rtDGpzjjqjlrGsWqBWFRsbTPFQMTbRNRFmbs
    FFlnlnVlmQqcBVhBRrSrGSwVdRJbztSt
    NPPNsffWfNztRZSJNG
    WpgpTTHDpgTDDpMLPGgMHslmBmmHcBQnFmcqhmnjlqQm
    VlVNLlPQhtnDRPnP
    QgqTffzZqgvgzWmqqZmGcDthtRFvnnFnhJtJJDDt
    WGTBzSqBQTQmZBWHswpNbswLbSNCNl
    PFzFQDdLjMzzQDhnDNmwZmqwRsmRRmMVNM
    GtSbbtlttvvtBvtHBmqqNqVVwsVgCmRw
    brlvctHfrlrqvGvcTpjDdFnLDhdfjLhQpn
    fTqzgFrcmzTrTNgMzFzTrgtbMtVMVPSLVbvSStRttPVV
    lsHnlQhplQpsHhlDJsswNwZPZZVNwvnSZSVvVS
    BJpsGWhWQQHdGHlpWpfgrmqgNBmTTBqzTrzr
    PLPPrDNHDBnrWNBmjDmjbqqgzjgjQC
    GJpFwpvFFsJpwvwwGwJZJRptzdQSSZTmCjTQmTSQjjZSggQQ
    ffwGGtJGCfLcNMNNfNLW
    nlTzllGwlQHHGMSrrhQLcvbcghgcvL
    fFNpttBRFFRNtJJnfNWmqbhhZrZrcjgpvLrvrvcvbr
    JBftFFsVRWtNWRsmWtRfftGHGPDDCnTDHSCwzwVnwGSw
    LsrZLbLmPSTZtPcc
    zpnpljpdwhRpfNLlPWPtTPcnMWPcctTV
    qlhNNjldqdpgqdfhjpphdsgmmrDBBJJQgHrmDHLQJb
    ndDrsBbpqspHCjzVBCHjMj
    LWFcQFQtVVdcCMHC
    RLthwTWLTSLwTllRLLlLNlPpPGfrGnqDdGqsZqsZsZhb
    jHnJLJrcBbrRHJpnLBBjdHbjfgvGwstwWwdsWWshfhFzFfhv
    PZDQMNTMQwtgvGTGhf
    lqlPPQZQVSQCPSCPDmLppjqRqHngLHjRgLnL
    MfQrhdzNMfMPsNNmPmqPLCLCVLBnbP
    WVtcVvJJVjvFZZmgGjnjLBjmnnHB
    FFtcZRpWJcSDTwlVMhMDwrrDzM
    bSMbrQGZwwqbrbGMdTQGMwQdfFBLDLHLHssDgsHHBJDsFfwL
    lpPPCccvVPvccPzcWLDJFJBsBzJJHsqHjg
    tnqlPlVlNvNZZSSrGGZb
    NlBBBBBwmwcMgLwLVVLLLscHdnMDdbHJCbdvJbPdDDJHvn
    ZRWQWSfGhtSjqZhffZhhRjtdvPFHvCJbFdCFFDdHJdPb
    fpqGhQWWZRhfqRSqrpGllLcVLmscgrLwBmgCzN
    wHHHwDNCzZwzZfpzwsswzfzvnvnMDMgMhMGGFGRVdMnvcF
    mLtttqTPBtSJTSBQWlmcMvVdclnvhFggdGhRdn
    QBLPSLQQWmLtTBtBSjZfsbwbHzpjGzHfpzzw
    zDPBqBPqwzzsqlTzzPzqjttNbCPJVtPCbrvjvCZP
    MFhMhGfFfGpWWpHhFfRpHjVNbDbJjVMjrVvVNtMtbt
    gfRSmpggSFRgfGRphFGgfgBSBTqzSsdlTLqdsnsDBqLw
    QTTdWZZZTrhCZrjhVt
    SBJJNRRvvRpwwspNSpTPjCMVhhtCjGThjBjB
    fJJpvRRwNRSwvzRzRvzSgSRNqFTFDbFmqncQTbdFfnbDQnLW
    wSjwwjWhbhhjWjdqSVpqSndvMdmM
    NTvPBrZgPPHDFrFHGvZHRBqVBpCQVRRdmpRppdqM
    TgDHZPsNTWbbwsjtvw
    HVRPRwJVppQNpGmvMvmqqq
    WcttbWsWsdDdbFDSSWclZGvFLMvfvjfzNvLGzLmfqv
    tglcmSldWlBQBThRQBhg
    LDGGfPFLGsfFnGLfMzfJVccNzmcmwm
    qggSRgtjgCRtdtNZCJMCcZwTZVcm
    RBbHbbRRnLBDDrvN
    pThhMtMtTsWspWTnGjpsVHPdjdjvHdgVvLDVVSjd
    JQNrrwCFrSRLRVLnSN
    JQcJFCfcnfQmrbblQqlthGqzpZpGTBMWTMqtst
    DzVmzDDgsNdHHLGJhJppPPllqSgbql
    jrBWjcQMCRchPShwSblpbW
    ZjRrSCtnnrtBQTcrSZmGtGFFNDHmHVVmVtzz
    GSbGbrTGRRScMlVFjfbqqjdF
    tvDmZhtNtHDttBhCmHDJHNwlpjslMwfflvpqldsFpMlf
    HdBhLDhJDLWWLDCSQGcrQPGccLTGcQ
    tNzrCdJBrrtQdtgQdlQQtrnMZhMTqzHqqTFZZFqTHFMV
    bwbsRDvfwfsfcfSFqMmqDqFVNMNVVH
    PRvfbSjNvPWPlLllLJ
    MjMRRNRMjZtGVGpBCMMCDV
    vwfhFzhvcJQQwJlQSddzQwFWGqcDpCDqBqDTcGZTTVTCWG
    dvFJzrfZJhddLNLPHsrtRbPr
    BmbsFNBhszGgGtGl
    MSHVwdSwZflGlcqqpM
    QvwZCnnnSvZdCSWrNmDlPPBPDhPmjW
    MDwpRzRwMzMsdVSjdMWWMQdW
    gmlftnDtHnHHVWSWBjWjWgvW
    HbtrhbbGRNDpbCDz
    cjVGqQqVqBFhDtvB
    ZnTTfTffZZmDhBtJZG
    fNzbpzlHTlgHNzlRTlRNbHrWwrCwWSSdQddNjwVcjGSd
    WWrPMhwhnjpSLCpDlSSW
    sNGBGdmTbZNGsmbstNLZGZDBRSlqSRCfRSCqRRDDqCqp
    NvvcGtsLdTNZmLTmdJPcnnMFjFMcrVJhMF
    wMRQMSQZHznRsqRbWp
    ddgDDhfDrrDdjthHmdHrzpbVCVWFpfVqCWpWqpFs
    hdvNdHtjMLJZvJwM
    nWzZtWzHzZWgQHMNLDMDfDBfQbdD
    MCPmRGGhqdmNjbDN
    FRPlMlRChCvFggWZsHsZHn
    ZGhhjdgwgcZHsPnRnSnbWscn
    tltlfMQQQftDFJpMQJsWJWJsnWBnRSBbrBWP
    lfLDpQMFMNfLjGjPPgZzwh
    HcmvWcqnHLLPDzPPHM
    MGGSfdJRdCglfrLjrjrLzLPzlF
    CsgRgfwgdCwhsssJBBwvcnQnQNMvQtQm
    nrVbwgnSTSgSnrZpjpWWqmWNHlqqpV
    BcBPhSdsDlHNtNlJNP
    RLFCQLQRRsBDDcRdGDddhCRDfwzvSCnzrbfrMfMgznwwfbZv
    HJLzLNwBNzNJLzBJztRGzQVnDgwsjbgwssZwnDZbDQ
    PhvlSvvPfMRlDbDsggbSjQSg
    mFfhMlMrfchvPPpFTPvMvPzLBHWRHJNtzJGzzHpzBtCC
    FLsgSLzLswdFgLBbWZnJDWHcmZnnBjHM
    rpbrrqfqpvCbqqQQvvpClblRDHmjmmjJJZZnWMJmmJmmcRMc
    qTppQvCfhzSVVTzbdL
    ThTJtlqfDrDtffwqRCFCCnLwdnmpzRdF
    WPQSSFsGMgQZWvFQgZgZQcCdmmzLMLCpNzCCddmLzdzm
    cvVPGPQQGsZsgGPjVFccbHhThJHhDqfhDDjHqDrr
    CgnCCnPMnMtGHDbMFQ
    zLpwpRTwwRwhRchHwmqmGvvGbqmTmNQqvq
    sHdhzlwrRVrdLzRrprrfjgfjVBnBCfSBZZgPfJ
    SPMdWwWPrZwdrrWrSPLFDfgbQDfwDFfFglDQ
    qLGBtGLpjzqmvQbvvpDvfFpR
    jhLqqHBLGjtLqSZCssSTZZMshP
    MhJCpPDpRRFRzQQNNqbcZjNZmVhjNm
    LLSlLnGDmNqLbNjb
    sfBngrBSTTSnSGHlTsHBGsBpFFdRdQPDCFPWRMzzdQWM
    ZQtmgtWfPcgPgcsb
    pvMhFThpHVTvPbcFcFJLJDsd
    MTVHchVVHjHHTcpjMVBjjnQnGqQZnlqBmrWQQBffQQ
    HfcRNJpJfhCmpGSqqGNjsjBnQl
    tTdPwwtLTrrTVPSnQsbGPsnnlFllFQ
    VvvTSTwWMrSZVwwrrmRmczJchHcHCZhRzD
    wfRwhmLRnvrHqHhV
    bJlBHlWlHMBPJzDlzMMJJSBlFnrGVrqspGGvpVGPVpGsVqvp
    DWdStDMztCCHgZCtmZ
    MHdsznVDDfcjcjDcdDjmMSCQwQpCpFCvqSZQqFzQpQ
    lhJnLJJnTNrWTRqvqqPrFwZvwqQp
    NghhtJBtnWLRTNjmcMDtjdsMfGDH
    jgsvPffVmHfDqPSrNwnQwnwNhSvw
    PZbGbCdcGdRCGtntQLQQLLwtpLNw
    RbcPFBRFcdZBBJDBmTHjsD
    dTTFJdzhmmmQpzVz
    jtNLcctGGjtfrnVMsNQNQVVWnv
    GcrcrfLtDggLftDFhZFdJFHJBVFBgZ
    TTbqTgqCqZCrwmhQnnmrgh
    MhpfsMLhfmrznLrQrF
    RsStRMtjpHMfDtWsWsNDppsqlZqBlhNlbcNdTPClPqcvBP
    lRhZPgnpRGZlSrmsLSvSzLVl
    wwHdHCfDQCJHdwdDMdHCcDsLmNVvzVsWrcVNcVzLbrLz
    dMCCwCtJdwDQJMtjhnvhpPhRZBhR
    pBqMZfDffmBnvnNmPt
    rhwLHCChrLPCMNWMCNmW
    GSMVRSVwHLMRJDQJTZlJZR
    sfstzPGRRBSngMfQLNNqgWLQLZZNgq
    scVDjjjCDTVhHlDhHdvvjwjHrZmWQmJmrJJWqNqLJbrcQqZq
    VvHlVHldTjvhpVplhVThhwjlPFSzPfGzpGBnsRffRRBPPGGF
    WNFNfnWTSLSJTnWShTvVZCnvrdPrZvddVCrt
    QwsMjppcpHCPdHsvPZ
    lcwMGgpcGbzQpMgQwbDjDQZSJTRfShffWNJSSNFFbhSb
    JDNgTgqDTggQbQGbZDWbJmVJrPVfPjlPfPwlljJC
    FZzHFSznZZtptHzcSmCVrwfPVcwwVrCcdm
    nMSStvnZFSHpLLtBtMzHnMWQvNhgDgGNRGNhgqRWTgqg
    SJcrhvbBLBLrDpllvnwHQRnllHnQ
    ffsjfMMZfVdCCgCfgTzmzslRtwFwFtTnqqHTJRQnqRqq
    CVPgmdggVjCJSrhrbrPrrSLW
    LPtcLtgddLMRRCMRpTBRrZnppvvGRvBw
    WNNJjDjqSjJSqWqzNqzlSlBTGGFvrppSrwTFpn
    qbNDWNNHbJqVtctwVmsfLCLP
    FvSSLMqgvVSQjQfgwpwWpj
    BthszRPRRNbNtzmHRbHNRNPfwJGcsswWQpffJpfsJcQFwJ
    bBtzPmRrbBRHtNCzPhqdCLFMLSSvdnvCTnML
    VPHWJPDjVLDDjDSFDJhgdnNGdbblzTzNjlnNbl
    ZprsRZMQwwmGZsvtQZgTfggqnbfdTzrbqlTd
    GZMtsscmsRZswwBQHBhDDJJPPCPWSWCJ
    mNDNNmmVMSVgGgGGqsqGLhQqsLGhLq
    nZBTZpJPhCpnnrsqbbcfczJfFccz
    HpBZZRPRHjnPPjrHnRtCZnBdShDVlMDNDgVmtmDdVDWSdN
    tBftztmztGBBCBSGHBmhvHHcchbshhThpbLJHJ
    wwzMrrMnQdldVdMvJTcLNnphphbLJv
    ZzwPVrWQlwrdStGGCWqDSSGW
    QwfrQPvhwPfzQrvWWpQpvVGGTDGsjbgNNcbfsGTsDFgG
    CtddSdZMRRdnJhRnHtZtlRMbGGDjDgggjNTZDNgTGFgGjc
    mdmdCnHhVWmLmwwL
    zLcWSWFcPJLWrWLSZrJLjVjHtjVsrdtstHdtVQgg
    nChlwwnmhlCNqhhjHMgDjVVdwMjdtd
    CNnBmNNThhhdhCdlBGGlGvNpcJbJLSbcZzcFJzpJTWPbzc
    LdPZTPVpLCVTtCNsNsfFnlDC
    SMwqcqcWQMbMhWQzBnsNfsFwrnnNNlrs
    WMMWhvQRNNNjvLgZ
    DWFGzrtfsZHZZMLt
    pNwNzNCNTpppmnvNMTLVjHLBLLjMRTLH
    PPdlPmJJNNClDdcdDDfWhzrW
    nSJVSHQQnwLThnhrML
    ddsjfRdGZjmGjRTwwTZhwrMwWwtb
    qCdfRdMmgssPfjsdjdPspBzQpScSSCBpzNBQzcQz
    fJnmRMJrlrmRmTRmbqssWVdqNVQdswdNNb
    GZggFHGhHHgHSFvtHPPPsfwgwNsVqjqNpNjNNssN
    PPSPDDBPBmBMlLfmLr
    BdqdCBqqCVPVTZBrlJcTcTJTcfcbwwmcgv
    WjGGLzLMhpWQmRGhpHfbhcDhHHHhgcsbJD
    tQzSGjWRzWBntntrZmVB
    clfLQLgfzfTLDMwNrNrrNDGCGG
    tmbpFtBvvmvdQQdFQwMJCG
    SnbtnqnSbnQQsBqzgLgVsLZTLTPfVg
    QnQBQQBVzqqzpmfgBpnqSDFPjhhWsFVhlsFFsDstFs
    MGGrTHcvRTTrrrCDpjvWtFPlFlsvjp
    bZbpTpJJBBQmBmJf
    dNVgDdVtPcNPhgTLPLpTPlnTHHRn
    WrvjvwjWwfwWjGJsrwBjQJjTQLbnSTTmpTRQSTClHTbLmn
    JqWWGvBJBwGJfJJGvwqZZddFtDFhgDqZhHNM
    VwJcNgbfvfJbfcmGLZfPhZLfZGTDhP
    CnnrlBlprsBnzQFntnZLqDhZZqThWGtWWSPL
    FllFdCjzlsCzjJNJGGJwHHVg
    fTbVBmNJCJRVbTmbfJFHsDjQHDHQjnQRsvDn
    cLWcrGtttddMPhrPhPtPrtzsnSQQBvHjFpFSpDHsMjnvjD
    PrPgPdhGWLrrqgdqcVCffbNblBwfVmwqwC
    gmBfbmlbBDqrdfrDcJ
    PwVWrQphQWWhQsJFcMPqzDdcJq
    QWCSSHpSQWCttQpCRCHNSlZBtrmBZTjvGgZjmBZjBn
    JrnhMPvtVtPVHJGrBrQwTmQmRGGB
    pSSZCFClCbbSLbljZlSlFFszzBwcZNwTzQNDmBwGTBNTBz
    ldsCCjpFjCqdLgsFjpsLFQgtnfqtJvnMtnvhWnHHMnnVWV
    hzNHzHjWNzwHjjhprpGvGgvGvvpv
    PLBVVRPDLdrgCdMrdrdC
    FmBTqTmLPrsFqTBDcTTVtNNJztqWQNQtWWtJqNNz
    fFffFvFBgHQWHdvfGglBWbqbPSSbSwVntPhZwwbS
    jJCMzNMCjNCLNMjjphPSPqhbqnwPZLSqZh
    rNpJJDzpcNMzzdBnGcQTccBvgv
    FRFMwsrzVtwstgbCHHJJPgNb
    hfZGhZDnnTTHTCCNzJjH
    hppDvznmZphZQVFQwFVWlRqFls
    jrjrgdHdFBZsBlcCGghWNgpgbCCp
    QwJJqQQMLwPTwLMMwzvzwwzhCWbvcNcCChWpchWbNGfFff
    qqFQJTmwJSPjZsrlnBjdHm
    QfffRppWfHpQSrWVpSGmGMMccSjBjmmGmc
    qdzLvbwzwdsWwnFdBBcBhMjMDvBBcBhc
    bPdZPqddqzFsZVRptZZQHVWNpN
    BzBQQHNjTSzzJDDFZFgJDJ
    qLvCnLpfCpqCnLJhntRglFncDrGrllmZFZlDrc
    JpqvfhRhLddfpbbtsdJWjHSwHHTNSQNPTVHQTb
    qVQCCVlQZWgHZMqgqWlrtScFwrmtmcJqSSsSJS
    MzdnddpNLzhRpzbzNPPBbPScjcnmrwSFjSjSJFtrwjcF
    ddTzRMPLdLbvhBRdLWGQClVVCWQZQDTGGf
    DHHTsldDNdPnVDCRDCNHllHwcMpprSMpRmphhRWhrhmzSS
    qJLBqQLvJLQgftgPjJrhrMMWSmWMmMrrSqrc
    FjfFftgLBjJPBLQZGvvZtNClnTTNGCdHTbCCNsnslH
    jHHNsNqhjsShsshdRRCDMfMbCWHBrGGC
    TJQFmnpgmTpBDCgCMCDZCGDC
    FwpQzwQTmVvwTJmFJzTcQSdhBNztNPNjSlqLhBNhSh
    vBCfSDcRMfRcRHSRRZZtPwrWWNtdSmrNVGSdwm
    gbLnTzqTbjhGqFzgWrtttQtrPQTtNPmP
    zbhjzglgzzlBGcsflsCl
    jNHDNNHjVGVDNQFDTQSFZzDQTd
    vvLwhbnpvPPgClwnfFTmTZQgffFFtTfc
    LrhrLvwrnJvhCHVVRZNMjsRJVB
    ShfcBWfvdhhJBBVwCJjHTRNwRVNC
    qQzlDqMDDDslPqGVLTNZVpPwTRZZpV
    bgbDbsqzsDTcfrgFFdgg
    vlRHvvHwvMMMTTlvjmRtBjSJmSnDnpdrpSSrJJnDQrLp
    cPfCgZZzNzzcGhNszcTPNZLrnVSJpJhDrrhSSQSpDDQn
    FbTgbGcgNgcFbPFHMqvjjRtjRWvFvt
    fZTnqfFFDNglcjdjZcfLGQJBwrGGQwbGQTBBJz
    VhvfvsPpWRChmphvRGBbBLGhSbLrBQBSwb
    pCsCsHvsstPsfRMMMtmDqFjngdFZqDHFnNFFjl
    PVVwffMlfGWMDDSwfDwVpRpsZRjBHgpSsjJSpBSp
    TdnFbqTFdmbjctcqcbRBZtJJZgsBzBBzvgHJ
    bNmbcqnnbNFLChCVCfjDfWlMjVDPCr
    JBLLjBQccLLJhcBDDlSrdFDsVhrVsR
    HgNWCgqWGbvCRRZvGWvZmszsSlrWdSdFrWzSldDF
    qvGCZGHggRNHvGTgvLnBjpjjPJwTPjLcJj
    GCGwQrwBZMZdGVdLzbqbbp
    TRfTTCtgcDmhtDmsTDVSbvpLdNpzNVRqVdVL
    CfDJjscgTcsjfhtFZljPZWZMWPlZjQ
    WsrjjfRfjjZjwjWjBpDpVpVhMBsMMSBT
    JgmqHnCHHPCCtCJgSZMgZppDTgzvzZMz
    HCGCGqqqCtmnHnqLFHWjlFrWRRbfjZccNWrR
    BJBfSfPLPvdhvrbbvpDsHgDTzgpdzgZpgN
    cVcmRnCWCqGngHpZsZsTsqNN
    jmGCVwWjjnWFMjGwcwmrLJbBJPbLSrPPTbFBTr
    SPZmmtlmqjZlZMwhlrtggqGGcCLCpfGLgqdCqF
    FBBVDVTVDJfgcddLCDdp
    zzVHvVNTbWJJTTRbVWBFJbWHmwmSPlMjPSShjlhMhhrrml
    GJZJZTsnhsDJtVZdtsZJZrBCQpLjQgBnrQgjCjQQQj
    RPSfqcRShHbFcPSfBqLLprBCwrQQQCqg
    zPzPRHbFPcRRRHPclMhSfvfZsJZVTTZsJNVMGWGVdGTWWD
    lCZrCLWCwVllGzWPPBMTFpsbGdsTpsbNMgFb
    RDjtjHcHjcHctDRtjnhtnHTgMqTMqhTbdbdZbgFqZdMN
    vfDmvfjtmvtcHmjZfSRZHQzBLrVLCJLJLfJBPzVJlwPw
    JMTHVZMWNSCwCwMS
    nsddQbDCnQQdDBPdCQCSvwpDvwffhfSvpmppvp
    BssqBFtqRHgTqVRC
    cWTTthtrgrzpCdCddtpz
    SSSLNJLGLSLfCJfJFQCJzQ
    swMPMZVMMSlMSZMqVSSHznzcqgzWTHgTnhbnrr
    RJjjgMjWShPqchtbVBPV
    DDddwCnZMHLLvDnfLrvvbVbbBtpwVBVPwtVpbcbb
    zrvnvLrlZCHrfZZLffHZHHTsTmsQgFQSFTMjjQlFTRmR
    zhTTMLRVTzLbVqwVRJgDQQsSCgCDNgsZCpqp
    rrmrBmmWrWnHjWnGWrnGnhDHSQgNSpQsCgSNgtNtDDHZ
    fBrGPGmGPBcTMfLhJVTc
    TbTCjTBSbCncHsDZDZPhZbzv
    rMwplFdlWWJMJzhhpGtHtvHSSP
    fMMfwWdWrNfJNdlVgMcTLTmLffjTqnLScCjL
    SwhTllwJDwqqBWLBbNtfhjBB
    mvllZMmRMZGFZRfctLWtWttzfNLR
    MGvHMCGpVnFGlgvVFFnpnGmmsHrDJJdSsqPqJSqDJJdTTDqD
    QTTcqJZJhHSpShhFpFzjDDwwsFzpdg
    NBMnBvmBPvwrqvgvvqgD
    bNNGmWmbbClQTQRqchhQbf))

(defn compartmentalize-rucksack [rucksack-str]
  (let [length (count rucksack-str)
        middle-index (/ length 2)]
    (list (subs rucksack-str 0 middle-index)
          (subs rucksack-str middle-index))))

(defn compartmentalize-rucksacks [input]
  (-> input
      (#(map str %))
      (#(map compartmentalize-rucksack %))))

(defn find-duplicate-items [[compartment-1 compartment-2]]
    (let [individual-contents (map str (vec compartment-2))]
    (filter #(java.lang.string/.contains compartment-1 %) individual-contents)))

(defn find-all-duplicates [input]
  (flatten (map distinct (map find-duplicate-items (compartmentalize-rucksacks input)))))

(defn determine-priority [item]
  (let [lower-case (map str '(a b c d e f g h i j k l m n o p q r s t u v w x y z))
        upper-case (map clojure.string/upper-case lower-case)]
    (inc (.indexOf (flatten(cons lower-case upper-case)) item))))

(defn determine-priorities [input]
  (map determine-priority (find-all-duplicates input)))

;a
(defn total-priority-score [input]
  (apply + (determine-priorities input)))

(defn determine-elf-groups
  ([input]
   (determine-elf-groups input '()))
  ([input elf-groups]
   (if (empty? input)
     elf-groups
     (do
       (let [[elf-1 elf-2 elf-3 & remaining] input]
         (determine-elf-groups remaining (cons [elf-1 elf-2 elf-3] elf-groups)))))))

(defn to-character-set [rucksack]
  (set (map str (java.lang.string/.toCharArray (str rucksack)))))

(defn find-badge [[rucksack-1 rucksack-2 rucksack-3]]
  (let [r1-as-charset (to-character-set rucksack-1)
        r2-as-charset (to-character-set rucksack-2)
        r3-as-charset (to-character-set rucksack-3)]
    (first (clojure.set/intersection r1-as-charset r2-as-charset r3-as-charset))))

(defn find-badges [input]
  (map find-badge (determine-elf-groups input)))

;b
(defn determine-total-badge-value [input]
  (apply + (map determine-priority (find-badges input))))
